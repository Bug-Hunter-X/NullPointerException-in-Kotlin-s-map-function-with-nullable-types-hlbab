# Kotlin NullPointerException in map Function

This repository demonstrates a common error in Kotlin when using the `map` function with lists containing nullable types. The `map` function throws a `NullPointerException` if it encounters a null value.

## Bug
The `bug.kt` file shows the issue. A `NullPointerException` is thrown because the `*` operator cannot be directly applied to a nullable integer.

## Solution
The `bugSolution.kt` file provides a solution by using the `elvis operator` or a safe call with the let function to handle null values gracefully. This prevents the exception and produces the expected results.

## How to reproduce
1. Clone this repository.
2. Open the project in your Kotlin IDE.
3. Run the `bug.kt` file to observe the error.
4. Run the `bugSolution.kt` file to see the corrected behavior.
