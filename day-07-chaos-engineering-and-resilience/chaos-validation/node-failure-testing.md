# Node Failure Testing

Node failure testing validates:
- workload survivability
during:
- infrastructure loss.

---

# Why This Matters

Node failures affect:
- all workloads running on the node.

Recovery requires:
- rescheduling
- startup
- readiness
- and dependency convergence.

---

# Validation Flow

Node becomes unavailable
→ Pods lost
→ Scheduler reschedules workloads
→ New pods initialize
→ Traffic stabilizes gradually

---

# Operational Risks

Large-scale recovery may create:
- startup storms
- reconnect amplification
- queue buildup
- and dependency overload.

---

# Stateful Risks

Stateful systems may additionally require:
- volume reattachment
- replication recovery
- and leader-election stabilization.

---

# Key Insight

Infrastructure recovery itself may become a distributed-system stress event.
