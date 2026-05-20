# Redundancy And Failover

Distributed systems improve reliability using:
- redundancy
- and automated failover.

Redundancy ensures:
- alternative operational capacity exists during failures.

---

# Why Redundancy Matters

Single points of failure create:
- operational fragility.

Resilient systems distribute:
- workloads
- replicas
- and infrastructure dependencies.

---

# Failover Behavior

Failure occurs
→ Healthy replica promoted
→ Traffic redirected
→ Recovery converges gradually

---

# Stateful Complexity

Stateful failover additionally requires:
- replication synchronization
- quorum management
- and consistency validation.

---

# Operational Risks

Failover events may still introduce:
- latency spikes
- reconnect storms
- and temporary instability.

---

# Key Insight

High availability depends on surviving failures safely instead of avoiding failures entirely.
