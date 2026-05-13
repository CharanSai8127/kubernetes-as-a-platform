# Distributed Failure Boundaries

Distributed systems are composed of multiple independently operating tiers such as frontend services, backend APIs, databases, queues, and external dependencies.

Each layer processes requests at different speeds, capacities, and latency characteristics.

In production systems, failures rarely remain isolated. A slowdown or failure in one dependency can amplify pressure across the entire platform through retries, hanging connections, startup storms, or cascading resource exhaustion.

The purpose of failure boundaries is to ensure failures remain local instead of spreading cluster-wide.

This introduces concepts such as:

- back pressure
- timeout enforcement
- retry budgets
- traffic admission
- queue protection
- graceful degradation
- circuit breakers
- blast radius reduction

Healthy distributed systems are not designed around perfect uptime.

They are designed around controlled failure behavior.
