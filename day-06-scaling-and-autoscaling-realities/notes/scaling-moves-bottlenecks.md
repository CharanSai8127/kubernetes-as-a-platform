# Scaling Moves Bottlenecks

Scaling one layer frequently shifts operational pressure toward another dependency.

Example:
- scaling APIs
may increase:
- database traffic
- queue pressure
- cache misses
- and replication load.

---

# Distributed-System Reality

Distributed systems scale only as fast as:
- their slowest dependency.

Removing one bottleneck frequently exposes:
- another operational limit.

---

# Operational Consequences

Successful application scaling may still create:
- database saturation
- connection exhaustion
- or cascading instability

inside downstream systems.

---

# Key Insight

Scaling often relocates operational pressure instead of permanently removing bottlenecks.
