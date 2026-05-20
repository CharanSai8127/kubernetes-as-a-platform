# Retry Storms

Retries help recover from:
- transient failures.

However uncontrolled retries may amplify:
- operational instability dramatically.

---

# Failure Amplification

Dependency becomes slow
→ Requests timeout
→ Clients retry aggressively
→ More traffic generated
→ Dependency pressure increases
→ More failures occur

---

# Why Retry Storms Are Dangerous

Retries may generate:
- significantly more traffic
than:
- the original workload itself.

This overwhelms:
- already unstable dependencies.

---

# Common Triggers

Retry storms frequently occur during:
- database slowdowns
- API latency
- DNS instability
- or network partitions.

---

# Operational Consequences

Retry amplification may create:
- cascading failures
- queue saturation
- thread exhaustion
- and complete service collapse.

---

# Key Insight

Recovery mechanisms themselves may amplify distributed-system failures.
