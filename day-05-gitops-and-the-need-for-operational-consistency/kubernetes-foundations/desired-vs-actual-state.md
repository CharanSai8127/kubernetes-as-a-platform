# Desired vs Actual State

One of the core principles behind Kubernetes is the separation between:
- desired state
- and actual state

This model allows systems to continuously reconcile toward intended operational behavior.

---

# Desired State

Desired state defines:
- how the system should behave

Examples include:
- replica counts
- workload configuration
- infrastructure state
- networking behavior
- and operational policies

Desired state is typically declared through manifests and APIs.

---

# Actual State

Actual state represents:
- how the system currently behaves

Distributed systems continuously change through:
- failures
- scaling events
- infrastructure instability
- and runtime mutations

Actual state frequently diverges from intended behavior.

---

# Reconciliation

Controllers continuously compare:
- desired state
against:
- actual state

When divergence occurs:
reconciliation loops attempt convergence toward intended operational behavior.

---

# GitOps Perspective

GitOps externalizes desired state into Git repositories.

Controllers continuously compare:
- Git state
against:
- cluster state

This allows:
- drift detection
- consistency management
- and operational correction

inside distributed systems.

---

# Reliability Engineering

Reliable systems depend heavily on:
- predictable convergence
- operational consistency
- and continuous correction

instead of relying on manual operational recovery.

---

# Key Insight

Kubernetes continuously attempts to reduce the gap between desired state and actual system behavior through reconciliation.
