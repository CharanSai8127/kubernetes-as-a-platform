# Scale-Out vs Scale-In

Scaling behavior is not symmetrical.

Scale-out and scale-in introduce very different operational risks inside distributed systems.

---

# Scale-Out

Scale-out means:
- adding operational capacity

Examples include:
- additional replicas
- additional nodes
- or additional workers

to absorb increasing demand.

Scale-out primarily improves:
- throughput
- concurrency
- and request distribution.

---

# Scale-In

Scale-in means:
- removing operational capacity

while:
- workloads may still actively process traffic.

This creates significantly higher operational risk.

---

# Why Scale-In Is Dangerous

Aggressive scale-in may:
- terminate inflight requests
- interrupt active connections
- drop queue processing
- or remove healthy capacity prematurely.

Distributed systems require time for:
- graceful draining
- connection termination
- and workload redistribution.

---

# Delayed Traffic Behavior

Traffic may continue reaching workloads briefly even after:
- scale-in events begin.

This creates temporary instability if capacity disappears too quickly.

---

# Operational Safety

Reliable scale-in depends on:
- stabilization windows
- graceful termination
- draining behavior
- and conservative downscaling policies

inside distributed systems.

---

# Operational Perspective

Scale-out improves capacity.

Scale-in must preserve operational correctness while removing capacity safely.

---

# Key Insight

Adding capacity is operationally easier than safely removing active capacity from distributed systems.
