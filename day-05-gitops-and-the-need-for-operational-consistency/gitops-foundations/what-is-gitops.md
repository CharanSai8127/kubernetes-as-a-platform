# What Is GitOps

GitOps is an operational model for managing infrastructure and applications through declarative state stored in Git.

It extends Kubernetes reconciliation principles into:
- infrastructure management
- application delivery
- operational recovery
- and configuration consistency

inside distributed systems.

---

# GitOps Is Not Deployment Automation

GitOps is often misunderstood as:
- deployment automation
- CI/CD tooling
- or manifest synchronization

The real purpose of GitOps is:
- operational consistency
- continuous reconciliation
- and drift correction

inside continuously changing systems.

---

# Desired State Management

Git becomes the source of truth for:
- infrastructure
- applications
- networking
- policies
- and operational configuration

Controllers continuously compare:
- desired state
- and actual state

then attempt reconciliation when drift occurs.

---

# Core GitOps Principles

GitOps systems are typically:
- declarative
- versioned
- immutable
- pull-based
- and continuously reconciled

This improves:
- auditability
- rollback safety
- operational visibility
- and consistency at scale

---

# Kubernetes Relationship

Kubernetes itself already operates using:
- controllers
- reconciliation loops
- and desired-state convergence

GitOps extends these principles toward:
- operational management
- infrastructure coordination
- and platform consistency

---

# Reliability Engineering Perspective

Distributed systems continuously drift due to:
- manual changes
- partial updates
- configuration inconsistencies
- and operational mutations

GitOps exists to continuously restore systems toward operational correctness.

---

# Key Insight

GitOps is not fundamentally about deployment.

It is about continuously maintaining consistency and correctness through reconciliation.
