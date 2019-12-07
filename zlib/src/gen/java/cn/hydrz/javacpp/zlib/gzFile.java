// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package cn.hydrz.javacpp.zlib;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static cn.hydrz.javacpp.zlib.global.zlib.*;

// #endif

// #ifndef Z_SOLO

/* gzgetc() macro and its supporting function and exposed data structure.  Note
 * that the real internal state is much larger than the exposed structure.
 * This abbreviated structure exposes just enough for the gzgetc() macro.  The
 * user should not mess with these exposed elements, since their names or
 * behavior could change in the future, perhaps even capriciously.  They can
 * only be used by the gzgetc() macro.  You have been warned.
 */
@Name("gzFile_s") @Properties(inherit = cn.hydrz.javacpp.zlib.presets.zlib.class)
public class gzFile extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gzFile() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gzFile(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gzFile(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gzFile position(long position) {
        return (gzFile)super.position(position);
    }

    public native @Cast("unsigned") int have(); public native gzFile have(int setter);
    public native @Cast("unsigned char*") BytePointer next(); public native gzFile next(BytePointer setter);
    public native @Cast("z_off64_t") long pos(); public native gzFile pos(long setter);
}
