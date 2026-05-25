# Availability Zone Storage

Cloud storage volumes commonly remain:
- availability-zone specific.

Example:
- AWS EBS volumes attach only within their configured availability zone.

---

# Why Zone Awareness Matters

If workloads move across:
- incompatible zones,
storage attachment may fail.

This creates:
- pending workloads
- failover instability
- and recovery delays.

---

# Runtime Storage Placement

Stateful systems continuously depend on:
- zone-compatible scheduling behavior.

Kubernetes scheduler must consider:
- storage topology constraints.

---

# Operational Challenges

Cross-zone storage behavior may create:
- attachment latency
- synchronization delays
- and runtime unpredictability.

---

# Platform Engineering Perspective

Availability-zone awareness strongly impacts:
- storage survivability engineering.

---

# Key Insight

Cloud storage topology directly affects workload placement behavior.
