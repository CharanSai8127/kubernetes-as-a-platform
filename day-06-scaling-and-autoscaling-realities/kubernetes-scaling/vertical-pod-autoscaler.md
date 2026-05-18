# Vertical Pod Autoscaler

The Vertical Pod Autoscaler (VPA) adjusts:
- CPU requests
- and memory requests

for workloads dynamically.

Instead of adding replicas,
VPA changes:
- resource allocation per workload.

---

# Why VPA Exists

Workloads frequently consume:
- too many resources
- or insufficient resources

inside Kubernetes environments.

Incorrect resource allocation creates:
- wasted infrastructure
- resource contention
- instability
- and scheduling inefficiency.

VPA attempts to optimize resource sizing automatically.

---

# Vertical vs Horizontal Scaling

Horizontal scaling:
- adds replicas.

Vertical scaling:
- increases workload capacity per replica.

These approaches solve different operational problems.

---

# Operational Challenges

Some workloads require pod recreation during:
- resource resizing
- or allocation changes.

This may introduce:
- temporary disruption
- restart behavior
- and operational instability.

---

# Stateful Workloads

Stateful systems may benefit from:
- larger memory allocations
- cache expansion
- or higher compute capacity

instead of:
- horizontal replica multiplication.

This makes vertical scaling operationally important for certain workloads.

---

# Operational Perspective

Reliable VPA usage depends on:
- workload characteristics
- restart tolerance
- and operational stability requirements.

---

# Key Insight

VPA optimizes workload resource allocation rather than increasing distributed workload concurrency directly.
