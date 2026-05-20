# Retry Amplification

Retries are designed to recover:
- transient failures.

However excessive retries may amplify:
- dependency instability dramatically.

---

# Failure Flow

Dependency slows down
→ Requests timeout
→ Clients retry aggressively
→ More traffic generated
→ Dependency overload worsens
→ More requests fail

---

# Why This Is Dangerous

Retries may generate:
- significantly more traffic
than:
- the original workload itself.

This creates:
- cascading operational pressure.

---

# Distributed-System Impact

Retry amplification may eventually create:
- queue saturation
- connection exhaustion
- thread starvation
- and dependency collapse.

---

# Recovery Difficulty

Dependencies attempting recovery still receive:
- amplified retry traffic.

This delays:
- operational stabilization.

---

# Key Insight

Recovery mechanisms themselves may become sources of distributed-system instability.
