# Noisy Neighbor Problem

The noisy neighbor problem occurs when:
- one workload consumes excessive shared resources.

This negatively impacts:
- other workloads sharing the same platform.

---

# Why Noisy Neighbors Matter

Shared infrastructure depends on:
- fair resource distribution.

Without controls,
one tenant may consume:
- CPU
- memory
- storage
- or networking resources excessively.

---

# Runtime Platform Impact

Noisy neighbors may cause:
- degraded performance
- workload instability
- and resource starvation.

---

# Governance Controls

Common protections include:
- ResourceQuota
- LimitRange
- requests
- limits
- and workload policies.

---

# Platform Engineering Perspective

Noisy-neighbor protection is a core requirement of multi-tenancy.

---

# Key Insight

One workload should not be able to degrade the experience of every other workload.
