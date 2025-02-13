```groovy
def myMethod(param) {
  if (param == null) {
    return null
  }
  // ... rest of the method
}

// Calling method with explicit null check:
def myMethod(param) {
  if (param == null) {
    return null
  }
  // ... rest of the method
}

// Calling method with explicit null check:
def result = myMethod(null)
println result ? result.someProperty : "Property not available" 

//Alternatively using elvis operator
println myMethod(null)?.someProperty ?: "Property not available"
```