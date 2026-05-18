# Autoscaling Buffer Capacity

Autoscaling is delayed.

Because scaling requires:
- metrics collection
- scheduling
- startup
- readiness
- and traffic propagation

systems must survive temporarily before scaling becomes effective.

Buffer capacity helps absorb this delay safely.

---

# Why Buffer Capacity Matters

Reactive autoscaling begins only after:
- operational pressure already exists.

Without spare capacity:
- latency spikes
- retries increase
- queues grow
- and failures may propagate

before scaling stabilizes the system.

---

# Minimum Replicas

Minimum replicas help maintain:
- baseline operational capacity

even during:
- sudden traffic spikes
- startup delays
- and temporary overload windows.

This reduces:
- scaling instability
- and delayed recovery behavior.

---

# Overprovisioning

Reliable systems frequently maintain:
- additional replicas
- spare infrastructure
- or pre-warmed capacity

to absorb temporary demand increases safely.

This improves:
- reliability
- startup resilience
- and operational stability.

---

# Cost Tradeoffs

Buffer capacity improves:
- stability
- responsiveness
- and reliability

but increases:
- infrastructure cost
- and unused operational capacity.

This becomes a reliability-versus-cost tradeoff.

---

# Operational Perspective

Reliable scaling depends heavily on:
- safety margins
- conservative scaling behavior
- and workload-aware baseline capacity.

---

# Key Insight

Distributed systems must maintain temporary spare capacity because autoscaling reacts slower than traffic changes occur.
