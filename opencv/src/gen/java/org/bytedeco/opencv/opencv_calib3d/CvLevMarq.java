// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_calib3d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;

import static org.bytedeco.opencv.global.opencv_calib3d.*;
 // extern "C"

//////////////////////////////////////////////////////////////////////////////////////////
@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_calib3d.class)
public class CvLevMarq extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvLevMarq(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvLevMarq(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvLevMarq position(long position) {
        return (CvLevMarq)super.position(position);
    }

    public CvLevMarq() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvLevMarq( int nparams, int nerrs, @ByVal(nullValue = "CvTermCriteria(cvTermCriteria(CV_TERMCRIT_EPS+CV_TERMCRIT_ITER,30,DBL_EPSILON))") CvTermCriteria criteria,
                  @Cast("bool") boolean completeSymmFlag/*=false*/ ) { super((Pointer)null); allocate(nparams, nerrs, criteria, completeSymmFlag); }
    private native void allocate( int nparams, int nerrs, @ByVal(nullValue = "CvTermCriteria(cvTermCriteria(CV_TERMCRIT_EPS+CV_TERMCRIT_ITER,30,DBL_EPSILON))") CvTermCriteria criteria,
                  @Cast("bool") boolean completeSymmFlag/*=false*/ );
    public CvLevMarq( int nparams, int nerrs ) { super((Pointer)null); allocate(nparams, nerrs); }
    private native void allocate( int nparams, int nerrs );
    public native void init( int nparams, int nerrs, @ByVal(nullValue = "CvTermCriteria(cvTermCriteria(CV_TERMCRIT_EPS+CV_TERMCRIT_ITER,30,DBL_EPSILON))") CvTermCriteria criteria,
                  @Cast("bool") boolean completeSymmFlag/*=false*/ );
    public native void init( int nparams, int nerrs );
    public native @Cast("bool") boolean update( @Const @ByPtrRef CvMat param, @ByPtrRef CvMat J, @ByPtrRef CvMat err );
    public native @Cast("bool") boolean updateAlt( @Const @ByPtrRef CvMat param, @ByPtrRef CvMat JtJ, @ByPtrRef CvMat JtErr, @ByPtrRef DoublePointer errNorm );
    public native @Cast("bool") boolean updateAlt( @Const @ByPtrRef CvMat param, @ByPtrRef CvMat JtJ, @ByPtrRef CvMat JtErr, @ByPtrRef DoubleBuffer errNorm );
    public native @Cast("bool") boolean updateAlt( @Const @ByPtrRef CvMat param, @ByPtrRef CvMat JtJ, @ByPtrRef CvMat JtErr, @ByPtrRef double[] errNorm );

    public native void clear();
    public native void step();
    /** enum CvLevMarq:: */
    public static final int DONE = 0, STARTED = 1, CALC_J = 2, CHECK_ERR = 3;

    public native @Ptr CvMat mask(); public native CvLevMarq mask(CvMat mask);
    public native @Ptr CvMat prevParam(); public native CvLevMarq prevParam(CvMat prevParam);
    public native @Ptr CvMat param(); public native CvLevMarq param(CvMat param);
    public native @Ptr CvMat J(); public native CvLevMarq J(CvMat J);
    public native @Ptr CvMat err(); public native CvLevMarq err(CvMat err);
    public native @Ptr CvMat JtJ(); public native CvLevMarq JtJ(CvMat JtJ);
    public native @Ptr CvMat JtJN(); public native CvLevMarq JtJN(CvMat JtJN);
    public native @Ptr CvMat JtErr(); public native CvLevMarq JtErr(CvMat JtErr);
    public native @Ptr CvMat JtJV(); public native CvLevMarq JtJV(CvMat JtJV);
    public native @Ptr CvMat JtJW(); public native CvLevMarq JtJW(CvMat JtJW);
    public native double prevErrNorm(); public native CvLevMarq prevErrNorm(double prevErrNorm);
    public native double errNorm(); public native CvLevMarq errNorm(double errNorm);
    public native int lambdaLg10(); public native CvLevMarq lambdaLg10(int lambdaLg10);
    public native @ByRef CvTermCriteria criteria(); public native CvLevMarq criteria(CvTermCriteria criteria);
    public native int state(); public native CvLevMarq state(int state);
    public native int iters(); public native CvLevMarq iters(int iters);
    public native @Cast("bool") boolean completeSymmFlag(); public native CvLevMarq completeSymmFlag(boolean completeSymmFlag);
    public native int solveMethod(); public native CvLevMarq solveMethod(int solveMethod);
}
