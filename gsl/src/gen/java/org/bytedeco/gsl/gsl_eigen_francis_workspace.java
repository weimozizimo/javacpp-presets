// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_eigen_francis_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_eigen_francis_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_eigen_francis_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_eigen_francis_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_eigen_francis_workspace position(long position) {
        return (gsl_eigen_francis_workspace)super.position(position);
    }

  public native @Cast("size_t") long size(); public native gsl_eigen_francis_workspace size(long size);           /* matrix size */
  public native @Cast("size_t") long max_iterations(); public native gsl_eigen_francis_workspace max_iterations(long max_iterations); /* max iterations since last eigenvalue found */
  public native @Cast("size_t") long n_iter(); public native gsl_eigen_francis_workspace n_iter(long n_iter);         /* number of iterations since last eigenvalue found */
  public native @Cast("size_t") long n_evals(); public native gsl_eigen_francis_workspace n_evals(long n_evals);        /* number of eigenvalues found so far */

  public native int compute_t(); public native gsl_eigen_francis_workspace compute_t(int compute_t);         /* compute Schur form T = Z^t A Z */

  public native gsl_matrix H(); public native gsl_eigen_francis_workspace H(gsl_matrix H);         /* pointer to Hessenberg matrix */
  public native gsl_matrix Z(); public native gsl_eigen_francis_workspace Z(gsl_matrix Z);         /* pointer to Schur vector matrix */
}
