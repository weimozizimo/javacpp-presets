// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class STARTUPINFOA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STARTUPINFOA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STARTUPINFOA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STARTUPINFOA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STARTUPINFOA position(long position) {
        return (STARTUPINFOA)super.position(position);
    }

    public native @Cast("DWORD") int cb(); public native STARTUPINFOA cb(int cb);
    public native @Cast("LPSTR") BytePointer lpReserved(); public native STARTUPINFOA lpReserved(BytePointer lpReserved);
    public native @Cast("LPSTR") BytePointer lpDesktop(); public native STARTUPINFOA lpDesktop(BytePointer lpDesktop);
    public native @Cast("LPSTR") BytePointer lpTitle(); public native STARTUPINFOA lpTitle(BytePointer lpTitle);
    public native @Cast("DWORD") int dwX(); public native STARTUPINFOA dwX(int dwX);
    public native @Cast("DWORD") int dwY(); public native STARTUPINFOA dwY(int dwY);
    public native @Cast("DWORD") int dwXSize(); public native STARTUPINFOA dwXSize(int dwXSize);
    public native @Cast("DWORD") int dwYSize(); public native STARTUPINFOA dwYSize(int dwYSize);
    public native @Cast("DWORD") int dwXCountChars(); public native STARTUPINFOA dwXCountChars(int dwXCountChars);
    public native @Cast("DWORD") int dwYCountChars(); public native STARTUPINFOA dwYCountChars(int dwYCountChars);
    public native @Cast("DWORD") int dwFillAttribute(); public native STARTUPINFOA dwFillAttribute(int dwFillAttribute);
    public native @Cast("DWORD") int dwFlags(); public native STARTUPINFOA dwFlags(int dwFlags);
    public native @Cast("WORD") short wShowWindow(); public native STARTUPINFOA wShowWindow(short wShowWindow);
    public native @Cast("WORD") short cbReserved2(); public native STARTUPINFOA cbReserved2(short cbReserved2);
    public native @Cast("LPBYTE") BytePointer lpReserved2(); public native STARTUPINFOA lpReserved2(BytePointer lpReserved2);
    public native @Cast("HANDLE") Pointer hStdInput(); public native STARTUPINFOA hStdInput(Pointer hStdInput);
    public native @Cast("HANDLE") Pointer hStdOutput(); public native STARTUPINFOA hStdOutput(Pointer hStdOutput);
    public native @Cast("HANDLE") Pointer hStdError(); public native STARTUPINFOA hStdError(Pointer hStdError);
}
