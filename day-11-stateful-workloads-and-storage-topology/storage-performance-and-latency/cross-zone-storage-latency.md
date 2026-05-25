# Cross-Zone Storage Latency

Stateful workloads may communicate across:
- availability zones.

This commonly happens when:
- workloads and storage exist in different topology domains.

---

# Why Cross-Zone Latency Matters

Cross-zone communication introduces:
- additional network traversal
- synchronization delays
- and runtime overhead.

---

# Runtime Communication Risks

Distributed storage continuously performs:
- replication
- synchronization
- and consistency coordination.

Cross-zone latency amplifies:
- communication-sensitive operations.

---

# Operational Challenges

Cross-zone communication may create:
- delayed replication
- timeout amplification
- and operational unpredictability.

---

# Platform Engineering Perspective

Storage locality strongly impacts:
- runtime communication efficiency.

---

# Key Insight

Storage topology directly affects distributed-system latency behavior.
