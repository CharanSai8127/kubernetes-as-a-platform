# DNS Failures

DNS is one of the most critical dependencies in distributed systems.

Nearly every workload depends on:
- service discovery
- internal resolution
- or external dependency lookup.

---

# Why DNS Failures Are Dangerous

DNS failures are frequently:
- intermittent
- partial
- or latency-related.

This creates:
- unpredictable system behavior.

---

# Common DNS Problems

Examples include:
- slow DNS resolution
- stale records
- lookup failures
- CoreDNS instability
- or upstream resolver failures.

---

# Operational Consequences

DNS instability may create:
- request timeouts
- dependency failures
- startup delays
- and retry amplification.

Applications may appear:
- randomly unstable.

---

# Debugging Difficulty

DNS failures are difficult because:
- symptoms appear across unrelated services simultaneously.

---

# Key Insight

Service discovery instability may silently impact the entire distributed system.
