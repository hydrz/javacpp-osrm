package cn.hydrz.javacpp.osrm.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

@Properties(
        value = {
                @Platform(include = {
                        "osrm/status.hpp",
                        "osrm/engine/status.hpp",
                        "osrm/osrm_fwd.hpp",
                        "osrm/osrm.hpp",
                }, compiler = "cpp11", link = "osrm"),
        },
        target = "cn.hydrz.javacpp.osrm",
        global = "cn.hydrz.javacpp.osrm.global.osrm"
)
public class osrm implements InfoMapper {

    @Override
    public void map(InfoMap infoMap) {
        infoMap
                .put(new Info("Status").annotations("@Cast(\"osrm::engine::Status\")").valueTypes("int"))
                .put(new Info("osrm::OSRM::operator =").javaNames(""))
                .put(new Info("osrm::OSRM::OSRM").javaText(
                        "public OSRM(@ByRef EngineConfig config) { super((Pointer)null); allocate(config); }\n"
                                + "private native void allocate(@ByRef EngineConfig config);\n"))
        ;
    }
}
