# Resource Contention

Scaling consumes resources.

As workloads scale:
- replicas compete for:
  - CPU
  - memory
  - network bandwidth
  - and storage throughput

inside shared infrastructure.

This creates operational contention.

---

# Why Contention Happens

Kubernetes environments frequently run:
- multiple workloads
- shared services
- and infrastructure components

on the same nodes.

Scaling one workload may therefore impact:
- unrelated workloads
- platform services
- or operational stability.

---

# Scaling Amplification

Autoscaling itself may increase:
- startup CPU spikes
- memory pressure
- image pull traffic
- and scheduling contention

during scaling events.

Scaling can therefore temporarily worsen instability before improving capacity.

---

# Contention Consequences

Resource contention may create:
- latency spikes
- noisy neighbors
- scheduling failures
- throttling
- and pod eviction behavior

inside distributed systems.

---

# Infrastructure Pressure

Aggressive scale-out may exhaust:
- node capacity
- cluster resources
- or storage throughput

faster than infrastructure scaling can react.

This creates delayed convergence behavior.

---

# Operational Perspective

Reliable scaling depends heavily on:
- workload isolation
- capacity planning
- and operational visibility into shared infrastructure pressure.

---

# Key Insight

Scaling improves workload capacity,
but may simultaneously increase contention across shared distributed infrastructure.
