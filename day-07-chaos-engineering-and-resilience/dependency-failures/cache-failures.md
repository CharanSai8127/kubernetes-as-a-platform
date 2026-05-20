# Cache Failures

Caches reduce:
- database pressure
- read amplification
- and request latency.

They are critical for:
- distributed-system performance and resilience.

---

# Failure Scenario

When caches fail:

Cache unavailable
→ Traffic redirected to database
→ Sudden database pressure spike
→ Connection buildup
→ Database instability

---

# Cache Stampede

If many workloads request:
- uncached data simultaneously,

systems may experience:
- thundering herd amplification.

This overloads:
- backend dependencies rapidly.

---

# Operational Consequences

Cache failures may create:
- latency spikes
- dependency saturation
- and cascading outages.

Especially during:
- traffic bursts.

---

# Consistency Tradeoffs

Caches introduce:
- stale data risks
- synchronization challenges
- and invalidation complexity.

---

# Key Insight

Caches improve scalability,
but failed caches may suddenly transfer operational pressure back to stateful dependencies.
