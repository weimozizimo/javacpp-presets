// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Context Frame
//
//  This frame has a several purposes: 1) it is used as an argument to
//  NtContinue, 2) is is used to constuct a call frame for APC delivery,
//  and 3) it is used in the user level thread creation routines.
//
//  The layout of the record conforms to a standard call frame.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class WOW64_CONTEXT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WOW64_CONTEXT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WOW64_CONTEXT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WOW64_CONTEXT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WOW64_CONTEXT position(long position) {
        return (WOW64_CONTEXT)super.position(position);
    }


    //
    // The flags values within this flag control the contents of
    // a CONTEXT record.
    //
    // If the context record is used as an input parameter, then
    // for each portion of the context record controlled by a flag
    // whose value is set, it is assumed that that portion of the
    // context record contains valid context. If the context record
    // is being used to modify a threads context, then only that
    // portion of the threads context will be modified.
    //
    // If the context record is used as an IN OUT parameter to capture
    // the context of a thread, then only those portions of the thread's
    // context corresponding to set flags will be returned.
    //
    // The context record is never used as an OUT only parameter.
    //

    public native @Cast("DWORD") int ContextFlags(); public native WOW64_CONTEXT ContextFlags(int ContextFlags);

    //
    // This section is specified/returned if CONTEXT_DEBUG_REGISTERS is
    // set in ContextFlags.  Note that CONTEXT_DEBUG_REGISTERS is NOT
    // included in CONTEXT_FULL.
    //

    public native @Cast("DWORD") int Dr0(); public native WOW64_CONTEXT Dr0(int Dr0);
    public native @Cast("DWORD") int Dr1(); public native WOW64_CONTEXT Dr1(int Dr1);
    public native @Cast("DWORD") int Dr2(); public native WOW64_CONTEXT Dr2(int Dr2);
    public native @Cast("DWORD") int Dr3(); public native WOW64_CONTEXT Dr3(int Dr3);
    public native @Cast("DWORD") int Dr6(); public native WOW64_CONTEXT Dr6(int Dr6);
    public native @Cast("DWORD") int Dr7(); public native WOW64_CONTEXT Dr7(int Dr7);

    //
    // This section is specified/returned if the
    // ContextFlags word contians the flag CONTEXT_FLOATING_POINT.
    //

    public native @ByRef WOW64_FLOATING_SAVE_AREA FloatSave(); public native WOW64_CONTEXT FloatSave(WOW64_FLOATING_SAVE_AREA FloatSave);

    //
    // This section is specified/returned if the
    // ContextFlags word contians the flag CONTEXT_SEGMENTS.
    //

    public native @Cast("DWORD") int SegGs(); public native WOW64_CONTEXT SegGs(int SegGs);
    public native @Cast("DWORD") int SegFs(); public native WOW64_CONTEXT SegFs(int SegFs);
    public native @Cast("DWORD") int SegEs(); public native WOW64_CONTEXT SegEs(int SegEs);
    public native @Cast("DWORD") int SegDs(); public native WOW64_CONTEXT SegDs(int SegDs);

    //
    // This section is specified/returned if the
    // ContextFlags word contians the flag CONTEXT_INTEGER.
    //

    public native @Cast("DWORD") int Edi(); public native WOW64_CONTEXT Edi(int Edi);
    public native @Cast("DWORD") int Esi(); public native WOW64_CONTEXT Esi(int Esi);
    public native @Cast("DWORD") int Ebx(); public native WOW64_CONTEXT Ebx(int Ebx);
    public native @Cast("DWORD") int Edx(); public native WOW64_CONTEXT Edx(int Edx);
    public native @Cast("DWORD") int Ecx(); public native WOW64_CONTEXT Ecx(int Ecx);
    public native @Cast("DWORD") int Eax(); public native WOW64_CONTEXT Eax(int Eax);

    //
    // This section is specified/returned if the
    // ContextFlags word contians the flag CONTEXT_CONTROL.
    //

    public native @Cast("DWORD") int Ebp(); public native WOW64_CONTEXT Ebp(int Ebp);
    public native @Cast("DWORD") int Eip(); public native WOW64_CONTEXT Eip(int Eip);
    public native @Cast("DWORD") int SegCs(); public native WOW64_CONTEXT SegCs(int SegCs);              // MUST BE SANITIZED
    public native @Cast("DWORD") int EFlags(); public native WOW64_CONTEXT EFlags(int EFlags);             // MUST BE SANITIZED
    public native @Cast("DWORD") int Esp(); public native WOW64_CONTEXT Esp(int Esp);
    public native @Cast("DWORD") int SegSs(); public native WOW64_CONTEXT SegSs(int SegSs);

    //
    // This section is specified/returned if the ContextFlags word
    // contains the flag CONTEXT_EXTENDED_REGISTERS.
    // The format and contexts are processor specific
    //

    public native @Cast("BYTE") byte ExtendedRegisters(int i); public native WOW64_CONTEXT ExtendedRegisters(int i, byte ExtendedRegisters);
    @MemberGetter public native @Cast("BYTE*") BytePointer ExtendedRegisters();

}
