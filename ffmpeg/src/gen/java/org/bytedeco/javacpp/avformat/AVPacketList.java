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
public class AVPacketList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVPacketList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVPacketList(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVPacketList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVPacketList position(long position) {
        return (AVPacketList)super.position(position);
    }

    public native @ByRef AVPacket pkt(); public native AVPacketList pkt(AVPacket pkt);
    public native AVPacketList next(); public native AVPacketList next(AVPacketList next);
}