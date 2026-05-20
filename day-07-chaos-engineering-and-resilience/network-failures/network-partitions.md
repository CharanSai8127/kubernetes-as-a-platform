# Network Partitions

Network partitions occur when:
- parts of a distributed system lose communication with each other.

Systems may remain:
- partially operational
while:
- synchronization breaks internally.

---

# Common Causes

Partitions may occur due to:
- cloud networking failures
- routing instability
- firewall misconfiguration
- NetworkPolicies
- or infrastructure outages.

---

# Stateful Risks

Stateful systems are especially vulnerable because:
- quorum
- replication
- and consensus

depend on reliable communication.

---

# Operational Consequences

Partitions may create:
- split-brain conditions
- replication lag
- inconsistent state
- or leader-election instability.

---

# Recovery Challenges

When communication restores:
- replicas must reconcile state safely.

This may introduce:
- delayed convergence
- synchronization pressure
- or failover instability.

---

# Key Insight

Distributed systems may remain partially alive while operational consistency silently breaks internally.
