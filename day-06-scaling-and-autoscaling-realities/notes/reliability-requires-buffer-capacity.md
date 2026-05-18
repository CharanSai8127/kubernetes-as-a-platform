# Reliability Requires Buffer Capacity

Autoscaling alone is insufficient for production reliability.

Distributed systems frequently require:
- spare replicas
- excess node capacity
- and operational headroom

to absorb temporary pressure safely.

---

# Why Buffer Capacity Exists

Scaling converges slower than:
- sudden traffic spikes
- dependency failures
- and workload bursts.

Without spare capacity:
systems may fail before:
- autoscaling completes.

---

# Reliability Tradeoffs

Operational buffers improve:
- latency stability
- startup resilience
- and overload tolerance

while increasing:
- infrastructure cost.

---

# Key Insight

Reliable distributed systems intentionally maintain temporary excess capacity because scaling is delayed.
