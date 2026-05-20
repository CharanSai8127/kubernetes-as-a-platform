# Steady-State Behavior

Chaos engineering validates whether:
- a system maintains acceptable operational behavior during failures.

This acceptable operational condition is called:
- steady-state behavior.

---

# Examples Of Steady State

Examples include:
- acceptable latency
- healthy request success rate
- stable queue depth
- or operational availability.

The exact steady state depends on:
- platform expectations.

---

# Failure Validation

Chaos experiments intentionally inject failures while observing:
- whether steady-state behavior remains acceptable.

Examples:
- pod deletion
- dependency latency
- network interruption
- or node failure.

---

# Why This Matters

Failures may occur internally while:
- users still experience healthy service behavior.

This indicates:
- operational resilience.

---

# Key Insight

Chaos engineering validates whether systems remain operationally stable while failures occur internally.
