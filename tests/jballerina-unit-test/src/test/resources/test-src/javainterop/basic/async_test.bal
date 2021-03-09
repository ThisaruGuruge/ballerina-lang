import ballerina/jballerina.java;

function asyncTest() returns int {
    return countSlowly();
}

// Interop functions
public function countSlowly() returns int = @java:Method {
    'class:"org/ballerinalang/nativeimpl/jvm/tests/AsyncInterop"
} external;

public function main() {
    completeFutureMoreThanOnce();
}
public function completeFutureMoreThanOnce() = @java:Method {
    'class:"org/ballerinalang/nativeimpl/jvm/tests/AsyncInterop"
} external;
