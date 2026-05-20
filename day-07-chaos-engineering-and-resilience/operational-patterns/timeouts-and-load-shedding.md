# Timeouts And Load Shedding

Timeouts prevent requests from:
- waiting indefinitely.

Load shedding intentionally rejects:
- excess traffic during overload conditions.

---

# Why Timeouts Matter

Without timeouts:
- blocked requests accumulate.

This creates:
- thread exhaustion
- memory pressure
- latency amplification
- and cascading failures.

---

# Timeout Flow

Dependency becomes slow
→ Requests remain open
→ Resources become blocked
→ Application instability increases

Timeouts terminate:
- unhealthy requests predictably.

---

# Load Shedding

When systems overload:
- low-priority traffic may be rejected intentionally.

This preserves:
- critical functionality.

---

# Operational Benefits

These mechanisms improve:
- stability
- responsiveness
- and graceful degradation during pressure.

---

# Key Insight

Healthy distributed systems sometimes reject traffic intentionally to preserve operational survivability.
