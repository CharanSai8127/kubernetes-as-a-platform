# Latency and Concurrency Signals

Latency and concurrency are often stronger indicators of operational pressure than CPU usage alone.

Distributed systems frequently degrade through:
- request buildup
- dependency waits
- and increasing response times

before CPU saturation becomes visible.

---

# Latency as a Pressure Signal

Latency growth often indicates:
- downstream saturation
- queue buildup
- network instability
- or resource contention

inside distributed systems.

Increasing latency may appear before:
- workloads fully exhaust CPU or memory resources.

---

# Concurrency Pressure

Concurrency measures:
- how many active requests or operations
the system currently handles simultaneously.

High concurrency frequently creates:
- connection exhaustion
- thread contention
- and dependency saturation

inside applications and databases.

---

# Hidden Operational Pressure

Systems may still appear healthy when:
- CPU averages remain low

while:
- request concurrency
- and latency

continue increasing rapidly.

This creates hidden instability.

---

# Why These Signals Matter

Latency and concurrency better represent:
- real user-facing operational pressure

than:
- infrastructure utilization alone.

This improves:
- scaling accuracy
- workload awareness
- and operational responsiveness.

---

# Operational Perspective

Reliable scaling requires visibility into:
- how users experience the system
not:
- only how much CPU the system consumes.

---

# Key Insight

Latency and concurrency often reveal operational saturation earlier than infrastructure resource metrics.
