// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.avutil.avutil.*;


/**
 * A reference to a data buffer.
 *
 * The size of this struct is not a part of the public ABI and it is not meant
 * to be allocated directly.
 */
@Properties(inherit = org.bytedeco.javacpp.avutil.avutil_presets.class)
public class AVBufferRef extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVBufferRef() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVBufferRef(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBufferRef(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVBufferRef position(long position) {
        return (AVBufferRef)super.position(position);
    }

    public native AVBuffer buffer(); public native AVBufferRef buffer(AVBuffer buffer);

    /**
     * The data buffer. It is considered writable if and only if
     * this is the only reference to the buffer, in which case
     * av_buffer_is_writable() returns 1.
     */
    public native @Cast("uint8_t*") BytePointer data(); public native AVBufferRef data(BytePointer data);
    /**
     * Size of data in bytes.
     */
    public native int size(); public native AVBufferRef size(int size);
}