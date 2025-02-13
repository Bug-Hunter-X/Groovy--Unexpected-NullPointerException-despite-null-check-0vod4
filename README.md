# Groovy NullPointerException Bug

This repository demonstrates a subtle NullPointerException (NPE) in Groovy that can occur even when a null check seems to be in place. The issue arises from the interaction between null return values and optional chaining.

## Bug Description
The `myMethod` function checks for null input.  If the input is null, it correctly returns null. However, the caller uses the safe navigation operator (`?.`) to access `someProperty`. While this prevents an NPE if `myMethod` returns a non-null object, it still causes an NPE if `myMethod` returns null as the attempt to access `someProperty` is performed on a null reference. 

## Reproduction
1. Clone the repository.
2. Run `bug.groovy` using a Groovy interpreter. You will see a `NullPointerException`.

## Solution
The solution involves explicitly handling the null case after the call to `myMethod`.