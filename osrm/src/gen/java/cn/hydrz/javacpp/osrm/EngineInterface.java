// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package cn.hydrz.javacpp.osrm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static cn.hydrz.javacpp.osrm.global.osrm.*;
 // ns api

@Namespace("osrm::engine") @Opaque @Properties(inherit = cn.hydrz.javacpp.osrm.presets.osrm.class)
public class EngineInterface extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public EngineInterface() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EngineInterface(Pointer p) { super(p); }
}
