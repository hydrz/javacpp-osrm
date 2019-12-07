package cn.hydrz.javacpp.zlib.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

/**
 * @author hydrz
 */
@Properties(
        value = {
                @Platform(include = "<zlib.h>", link = "z@.1#"),
                @Platform(value = "windows", link = "zlib#")
        },
        target = "cn.hydrz.javacpp.zlib",
        global = "cn.hydrz.javacpp.zlib.global.zlib"
)
public class zlib implements InfoMapper {
    @Override
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("ZEXTERN", "ZEXPORT", "z_const", "zlib_version").cppTypes().annotations())
                .put(new Info("FAR").cppText("#define FAR"))
                .put(new Info("OF").cppText("#define OF(args) args"))
                .put(new Info("Z_ARG").cppText("#define Z_ARG(args) args"))
                .put(new Info("Byte", "Bytef", "charf").cast().valueTypes("byte").pointerTypes("BytePointer"))
                .put(new Info("uInt", "uIntf").cast().valueTypes("int").pointerTypes("IntPointer"))
                .put(new Info("uLong", "uLongf", "z_crc_t", "z_off_t", "z_size_t").cast().valueTypes("long").pointerTypes("CLongPointer"))
                .put(new Info("z_off64_t").cast().valueTypes("long").pointerTypes("LongPointer"))
                .put(new Info("voidp", "voidpc", "voidpf").valueTypes("Pointer"))
                .put(new Info("gzFile_s").pointerTypes("gzFile"))
                .put(new Info("gzFile").valueTypes("gzFile"))
                .put(new Info("Z_LARGE64", "!defined(ZLIB_INTERNAL) && defined(Z_WANT64)").define(false))
                .put(new Info("inflateGetDictionary", "gzopen_w", "gzvprintf").skip());
    }
}
