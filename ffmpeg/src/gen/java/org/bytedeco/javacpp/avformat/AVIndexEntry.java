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
public class AVIndexEntry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVIndexEntry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVIndexEntry(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVIndexEntry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVIndexEntry position(long position) {
        return (AVIndexEntry)super.position(position);
    }

    public native @Cast("int64_t") long pos(); public native AVIndexEntry pos(long pos);
    /**
                                   * Timestamp in AVStream.time_base units, preferably the time from which on correctly decoded frames are available
                                   * when seeking to this entry. That means preferable PTS on keyframe based formats.
                                   * But demuxers can choose to store a different timestamp, if it is more convenient for the implementation or nothing better
                                   * is known
                                   */
    public native @Cast("int64_t") long timestamp(); public native AVIndexEntry timestamp(long timestamp);
public static final int AVINDEX_KEYFRAME = 0x0001;
public static final int AVINDEX_DISCARD_FRAME =  0x0002;    /**
                                          * Flag is used to indicate which frame should be discarded after decoding.
                                          */
    public native @NoOffset int flags(); public native AVIndexEntry flags(int flags);
    public native @NoOffset int size(); public native AVIndexEntry size(int size); //Yeah, trying to keep the size of this small to reduce memory requirements (it is 24 vs. 32 bytes due to possible 8-byte alignment).
    /** Minimum distance between this and the previous keyframe, used to avoid unneeded searching. */
    public native int min_distance(); public native AVIndexEntry min_distance(int min_distance);
}