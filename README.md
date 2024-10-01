Observation:

- `UnsafeVanilla` throws a `ClassNotFoundException`, unless `requires jdk.unsupported;` is added in the `module-info.java`
- `UsafeTest` just works

Question:

How does `UnsafeTest` do this? Can I apply this to `UnsafeVanilla` so I can make it not throw the exception, without adding `requires jdk.unsupported;`?
