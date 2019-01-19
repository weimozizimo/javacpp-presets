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
 * Callback used by devices to communicate with application.
 */
@Properties(inherit = org.bytedeco.javacpp.avformat.avformat_presets.class)
public class av_format_control_message extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    av_format_control_message(Pointer p) { super(p); }
    protected av_format_control_message() { allocate(); }
    private native void allocate();
    public native int call(AVFormatContext s, int type,
                                         Pointer data, @Cast("size_t") long data_size);
}