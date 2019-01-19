// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.avutil.*;
import static org.bytedeco.javacpp.avutil.avutil.*;
import org.bytedeco.javacpp.swresample.*;
import static org.bytedeco.javacpp.swresample.swresample.*;

import static org.bytedeco.javacpp.avcodec.avcodec.*;


@Properties(inherit = org.bytedeco.javacpp.avcodec.avcodec_presets.class)
public class AVCodecHWConfig extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVCodecHWConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVCodecHWConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVCodecHWConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVCodecHWConfig position(long position) {
        return (AVCodecHWConfig)super.position(position);
    }

    /**
     * A hardware pixel format which the codec can use.
     */
    public native @Cast("AVPixelFormat") int pix_fmt(); public native AVCodecHWConfig pix_fmt(int pix_fmt);
    /**
     * Bit set of AV_CODEC_HW_CONFIG_METHOD_* flags, describing the possible
     * setup methods which can be used with this configuration.
     */
    public native int methods(); public native AVCodecHWConfig methods(int methods);
    /**
     * The device type associated with the configuration.
     *
     * Must be set for AV_CODEC_HW_CONFIG_METHOD_HW_DEVICE_CTX and
     * AV_CODEC_HW_CONFIG_METHOD_HW_FRAMES_CTX, otherwise unused.
     */
    public native @Cast("AVHWDeviceType") int device_type(); public native AVCodecHWConfig device_type(int device_type);
}