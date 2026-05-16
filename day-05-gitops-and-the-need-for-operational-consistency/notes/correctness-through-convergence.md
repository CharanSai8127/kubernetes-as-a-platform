# Correctness Through Convergence

Successful deployment does not automatically guarantee operational correctness.

Distributed systems become operationally correct only after:
- dependencies converge
- migrations complete
- APIs become valid
- and infrastructure reaches dependency-safe state.

---

Kubernetes continuously attempts convergence toward:
- intended operational behavior

GitOps extends this convergence model toward:
- infrastructure management
- application delivery
- and operational consistency.

---

Operational correctness frequently depends on:
- dependency sequencing
- sync waves
- migration coordination
- and reconciliation visibility

inside distributed systems.

---

Examples include:
- database migrations before APIs
- certificates before ingress routing
- and storage provisioning before workload reconciliation.

---

# Key Insight

Distributed systems achieve operational correctness through continuous convergence toward dependency-safe state.
