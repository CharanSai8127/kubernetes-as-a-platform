# CPU Looked Healthy but Users Failed

Infrastructure metrics may appear healthy while:
- users still experience severe operational degradation.

This is one of the most dangerous hidden scaling failures inside distributed systems.

---

# Why CPU Can Be Misleading

Applications may experience:
- database waits
- queue backlog
- dependency latency
- network instability
- or blocked concurrency

without consuming significant CPU.

Systems therefore appear:
- operationally healthy
through infrastructure metrics alone.

---

# Hidden Operational Saturation

Users may experience:
- high latency
- failed requests
- retries
- and timeouts

while:
- CPU averages remain low.

This creates:
- false operational confidence.

---

# Autoscaling Blind Spots

CPU-based autoscaling may fail to react because:
- infrastructure utilization appears normal.

Meanwhile:
- dependency saturation
- and operational backlog

continue growing silently.

---

# Operational Visibility Problems

Poor metric quality prevents autoscaling systems from understanding:
- real workload pressure
- and user-facing instability.

This delays:
- scaling
- diagnosis
- and operational recovery.

---

# Operational Perspective

Reliable scaling depends heavily on:
- workload-aware metrics
- latency visibility
- queue monitoring
- and dependency-aware observability.

---

# Key Insight

Infrastructure metrics alone frequently fail to represent real user-facing operational pressure inside distributed systems.
