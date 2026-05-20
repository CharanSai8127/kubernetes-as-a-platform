# Startup Storms

Startup storms occur when:
- many workloads recover simultaneously.

Examples include:
- node recovery
- deployment rollouts
- autoscaling bursts
- or zone restoration.

---

# Failure Flow

Infrastructure recovers
→ Many pods start together
→ All reconnect to dependencies
→ Database connections spike
→ Dependency saturation occurs

---

# Why Startup Storms Matter

Recovery events may generate:
- sudden operational pressure
larger than:
- normal production traffic.

---

# Stateful Risks

Stateful systems are especially vulnerable because:
- replication
- synchronization
- and connection management

require:
- coordinated recovery behavior.

---

# Operational Mitigation

Systems often use:
- readiness delays
- gradual rollout strategies
- connection pooling
- and queue buffering

to reduce:
- startup amplification.

---

# Key Insight

Infrastructure recovery itself may create distributed-system overload.
