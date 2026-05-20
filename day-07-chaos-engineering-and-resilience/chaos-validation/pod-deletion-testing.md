# Pod Deletion Testing

Pod deletion testing validates:
- workload recovery behavior
during:
- unexpected pod termination.

---

# Why This Matters

Pods may terminate due to:
- crashes
- OOM kills
- node instability
- or probe failures.

Distributed systems must recover:
- automatically
- and safely.

---

# Validation Flow

Pod deleted
→ Deployment detects replica mismatch
→ New pod scheduled
→ Readiness checks validate health
→ Traffic restored

---

# Operational Risks

Recovery may still introduce:
- startup latency
- dependency overload
- reconnect storms
- and cascading retries.

---

# What Chaos Testing Validates

Pod chaos testing validates:
- recovery speed
- readiness behavior
- traffic stability
- and operational convergence.

---

# Key Insight

Self-healing must be validated under real failure conditions instead of assumed operationally.
