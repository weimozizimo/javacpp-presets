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

/**
 * \}
 */

@Opaque @Properties(inherit = org.bytedeco.javacpp.avcodec.avcodec_presets.class)
public class AVCodecInternal extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVCodecInternal() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVCodecInternal(Pointer p) { super(p); }
}