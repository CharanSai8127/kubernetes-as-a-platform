# Bottleneck Migration

Scaling frequently moves bottlenecks instead of eliminating them.

As systems expand capacity in one layer:
- pressure shifts toward another operational dependency.

This behavior is called:
- bottleneck migration.

---

# How Bottlenecks Move

Example:
- scaling API replicas
may increase:
- database traffic
- cache pressure
- queue consumption
- or network utilization.

The application layer improves,
but another dependency becomes saturated instead.

---

# Distributed-System Reality

Distributed systems scale only as fast as:
- their slowest dependency.

Improving one operational layer does not automatically improve:
- the entire platform.

This creates continuously shifting operational bottlenecks.

---

# Hidden Saturation

Systems may initially appear improved while:
- downstream latency
- retries
- and dependency pressure

continue growing silently.

This creates delayed operational instability.

---

# Scaling Tradeoffs

Aggressive scale-out may increase:
- replication traffic
- connection storms
- synchronization overhead
- and infrastructure pressure

inside distributed systems.

---

# Operational Perspective

Reliable scaling depends heavily on:
- identifying bottleneck propagation
- dependency-aware architecture
- and operational visibility across the entire platform.

---

# Key Insight

Scaling often relocates operational pressure rather than permanently removing distributed-system bottlenecks.
