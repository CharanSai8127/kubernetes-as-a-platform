# Aggressive Liveness Probe Restarts

Improper liveness probes may restart:
- overloaded but recoverable applications.

This creates:
- unnecessary instability during pressure conditions.

---

# Failure Flow

Application becomes temporarily slow
→ Liveness probe fails
→ Pod restarted
→ Traffic shifts to remaining replicas
→ Load increases further
→ More probes fail

---

# Why This Is Dangerous

Recovery mechanisms themselves amplify:
- operational pressure.

Repeated restarts may create:
- restart storms
- dependency overload
- and cascading failures.

---

# Operational Consequences

Applications may experience:
- unstable recovery
- request failures
- and prolonged outages.

---

# Mitigation Strategies

Systems reduce instability using:
- better readiness checks
- higher probe thresholds
- startup probes
- and graceful recovery windows.

---

# Key Insight

Incorrect health-check behavior may destabilize healthy-but-overloaded distributed systems.
