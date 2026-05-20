# Storage Failures

Storage failures are among the most dangerous production failures.

Unlike stateless compute:
- data cannot simply be recreated safely.

---

# Common Storage Problems

Examples include:
- disk exhaustion
- storage latency spikes
- corrupted volumes
- failed persistent disks
- and detached storage devices.

---

# Stateful-System Impact

Storage instability may create:
- replication delay
- unavailable writes
- corrupted synchronization
- and recovery instability.

---

# Kubernetes Challenges

Persistent workloads may require:
- volume reattachment
- storage reconciliation
- and replica synchronization

before:
- applications become operational again.

---

# Operational Recovery

Storage recovery is frequently:
- slower
- riskier
- and more operationally sensitive

than:
- stateless workload recovery.

---

# Key Insight

Stateful recovery depends on preserving data consistency safely during infrastructure instability.
