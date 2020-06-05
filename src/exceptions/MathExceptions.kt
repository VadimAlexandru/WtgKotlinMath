package exceptions

import java.lang.Exception

open class MathException(exception : String) : Exception(exception)

class BadParameterException(msg : String) : MathException(msg)
class BadDataException(exception : String) : MathException(exception)
class FunctionFailedToConvergeException(exception : String) : MathException(exception)
class IncorrectTypeException(exception : String) : MathException(exception)
class MatrixException(exception : String) : MathException(exception)
class OutOfBoundsException(exception : String) : MathException(exception)
class SingularMatrixException(exception : String) : MathException(exception)
class VectorException(exception : String) : MathException(exception)