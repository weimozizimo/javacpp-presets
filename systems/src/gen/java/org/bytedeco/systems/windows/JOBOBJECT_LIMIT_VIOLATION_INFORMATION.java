// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class JOBOBJECT_LIMIT_VIOLATION_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JOBOBJECT_LIMIT_VIOLATION_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JOBOBJECT_LIMIT_VIOLATION_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JOBOBJECT_LIMIT_VIOLATION_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JOBOBJECT_LIMIT_VIOLATION_INFORMATION position(long position) {
        return (JOBOBJECT_LIMIT_VIOLATION_INFORMATION)super.position(position);
    }

    public native @Cast("DWORD") int LimitFlags(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION LimitFlags(int LimitFlags);
    public native @Cast("DWORD") int ViolationLimitFlags(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION ViolationLimitFlags(int ViolationLimitFlags);
    public native @Cast("DWORD64") long IoReadBytes(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION IoReadBytes(long IoReadBytes);
    public native @Cast("DWORD64") long IoReadBytesLimit(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION IoReadBytesLimit(long IoReadBytesLimit);
    public native @Cast("DWORD64") long IoWriteBytes(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION IoWriteBytes(long IoWriteBytes);
    public native @Cast("DWORD64") long IoWriteBytesLimit(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION IoWriteBytesLimit(long IoWriteBytesLimit);
    public native @ByRef LARGE_INTEGER PerJobUserTime(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION PerJobUserTime(LARGE_INTEGER PerJobUserTime);
    public native @ByRef LARGE_INTEGER PerJobUserTimeLimit(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION PerJobUserTimeLimit(LARGE_INTEGER PerJobUserTimeLimit);
    public native @Cast("DWORD64") long JobMemory(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION JobMemory(long JobMemory);
    public native @Cast("DWORD64") long JobMemoryLimit(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION JobMemoryLimit(long JobMemoryLimit);
    public native @Cast("JOBOBJECT_RATE_CONTROL_TOLERANCE") int RateControlTolerance(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION RateControlTolerance(int RateControlTolerance);
    public native @Cast("JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL") int RateControlToleranceLimit(); public native JOBOBJECT_LIMIT_VIOLATION_INFORMATION RateControlToleranceLimit(int RateControlToleranceLimit);
}
