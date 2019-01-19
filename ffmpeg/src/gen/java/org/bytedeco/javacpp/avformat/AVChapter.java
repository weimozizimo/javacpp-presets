// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.avutil.*;
import static org.bytedeco.javacpp.avutil.avutil.*;
import org.bytedeco.javacpp.swresample.*;
import static org.bytedeco.javacpp.swresample.swresample.*;
import org.bytedeco.javacpp.avcodec.*;
import static org.bytedeco.javacpp.avcodec.avcodec.*;

import static org.bytedeco.javacpp.avformat.avformat.*;


@Properties(inherit = org.bytedeco.javacpp.avformat.avformat_presets.class)
public class AVChapter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVChapter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVChapter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVChapter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVChapter position(long position) {
        return (AVChapter)super.position(position);
    }

    /** unique ID to identify the chapter */
    public native int id(); public native AVChapter id(int id);
    /** time base in which the start/end timestamps are specified */
    public native @ByRef AVRational time_base(); public native AVChapter time_base(AVRational time_base);
    /** chapter start/end time in time_base units */
    public native @Cast("int64_t") long start(); public native AVChapter start(long start);
    public native @Cast("int64_t") long end(); public native AVChapter end(long end);
    public native AVDictionary metadata(); public native AVChapter metadata(AVDictionary metadata);
}