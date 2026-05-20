# Recovery Under Pressure

Recovery itself may create:
- operational instability.

Distributed systems frequently experience:
- amplified pressure during recovery events.

---

# Recovery Amplification

Infrastructure recovers
→ Pods restart together
→ Dependencies reconnect simultaneously
→ Database pressure spikes
→ Recovery slows further

---

# Why This Happens

Recovery events often generate:
- sudden operational traffic
larger than:
- normal production load.

---

# Common Recovery Risks

Examples include:
- retry storms
- startup amplification
- replication lag
- and queue saturation.

---

# Operational Mitigation

Systems reduce recovery instability using:
- gradual rollouts
- readiness delays
- connection pooling
- queues
- and traffic throttling.

---

# Key Insight

Recovery mechanisms themselves may amplify distributed-system instability under pressure.
