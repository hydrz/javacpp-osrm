// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package cn.hydrz.javacpp.zlib;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static cn.hydrz.javacpp.zlib.global.zlib.*;

@Properties(inherit = cn.hydrz.javacpp.zlib.presets.zlib.class)
public class free_func extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    free_func(Pointer p) { super(p); }
    protected free_func() { allocate(); }
    private native void allocate();
    public native void call(Pointer opaque, Pointer address);
}
