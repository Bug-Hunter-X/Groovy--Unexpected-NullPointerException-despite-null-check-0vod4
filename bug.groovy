```groovy
def myMethod(param) {
  if (param == null) {
    return null // This will cause an NPE later
  }
  // ... rest of the method
}

// Calling method:
println myMethod(null)?.someProperty
```