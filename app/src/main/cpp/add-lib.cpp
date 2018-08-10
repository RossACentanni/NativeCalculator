#include <jni.h>

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_nativecalculator_CalculatorActivity_Calculator_CAdd(JNIEnv *env, jclass type,
                                                                     jobject obj) {
    //Get Calculator class.
    jclass cls = env->GetObjectClass(obj);

    //Get field IDs of operands.
    jfieldID fieldID1 = env->GetFieldID(cls, "operand1", "I");
    jfieldID fieldID2 = env->GetFieldID(cls, "operand2", "I");

    //Get the actual ints so we can finally add them.
    int op1 = env->GetIntField(obj, fieldID1);
    int op2 = env->GetIntField(obj, fieldID2);

    return (op1 + op2);
}