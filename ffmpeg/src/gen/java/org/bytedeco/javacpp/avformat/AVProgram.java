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


/**
 * New fields can be added to the end with minor version bumps.
 * Removal, reordering and changes to existing fields require a major
 * version bump.
 * sizeof(AVProgram) must not be used outside libav*.
 */
@Properties(inherit = org.bytedeco.javacpp.avformat.avformat_presets.class)
public class AVProgram extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVProgram() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVProgram(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVProgram(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVProgram position(long position) {
        return (AVProgram)super.position(position);
    }

    public native int id(); public native AVProgram id(int id);
    public native int flags(); public native AVProgram flags(int flags);
    /** selects which program to discard and which to feed to the caller */
    public native @Cast("AVDiscard") int discard(); public native AVProgram discard(int discard);
    public native @Cast("unsigned int*") IntPointer stream_index(); public native AVProgram stream_index(IntPointer stream_index);
    public native @Cast("unsigned int") int nb_stream_indexes(); public native AVProgram nb_stream_indexes(int nb_stream_indexes);
    public native AVDictionary metadata(); public native AVProgram metadata(AVDictionary metadata);

    public native int program_num(); public native AVProgram program_num(int program_num);
    public native int pmt_pid(); public native AVProgram pmt_pid(int pmt_pid);
    public native int pcr_pid(); public native AVProgram pcr_pid(int pcr_pid);
    public native int pmt_version(); public native AVProgram pmt_version(int pmt_version);

    /*****************************************************************
     * All fields below this line are not part of the public API. They
     * may not be used outside of libavformat and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */
    public native @Cast("int64_t") long start_time(); public native AVProgram start_time(long start_time);
    public native @Cast("int64_t") long end_time(); public native AVProgram end_time(long end_time);

    /** reference dts for wrap detection */
    public native @Cast("int64_t") long pts_wrap_reference(); public native AVProgram pts_wrap_reference(long pts_wrap_reference);
    /** behavior on wrap detection */
    public native int pts_wrap_behavior(); public native AVProgram pts_wrap_behavior(int pts_wrap_behavior);
}